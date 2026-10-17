package jv0;

import android.content.Context;
import android.net.Uri;
import androidx.media3.common.MediaItem;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.datasource.DefaultHttpDataSource;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.datasource.cache.CacheDataSource;
import androidx.media3.datasource.cache.SimpleCache;
import androidx.media3.exoplayer.dash.DashMediaSource;
import androidx.media3.exoplayer.dash.DefaultDashChunkSource;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.exoplayer.source.BaseMediaSource;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    private c() {
    }

    public static CacheDataSource.Factory a(DefaultHttpDataSource.Factory factory, Cache cache) {
        CacheDataSource.Factory upstreamDataSourceFactory = new CacheDataSource.Factory().setUpstreamDataSourceFactory(factory);
        Intrinsics.checkNotNullExpressionValue(upstreamDataSourceFactory, "setUpstreamDataSourceFactory(...)");
        if (cache != null) {
            upstreamDataSourceFactory.setCache(cache);
        }
        return upstreamDataSourceFactory;
    }

    public static ProgressiveMediaSource b(Uri uri2, Cache cache) {
        DefaultHttpDataSource.Factory userAgent = new DefaultHttpDataSource.Factory().setUserAgent((String) jo0.m.i.invoke());
        Intrinsics.checkNotNullExpressionValue(userAgent, "setUserAgent(...)");
        ProgressiveMediaSource progressiveMediaSourceCreateMediaSource = new ProgressiveMediaSource.Factory(a(userAgent, cache)).createMediaSource(MediaItem.fromUri(uri2));
        Intrinsics.checkNotNullExpressionValue(progressiveMediaSourceCreateMediaSource, "createMediaSource(...)");
        return progressiveMediaSourceCreateMediaSource;
    }

    public static BaseMediaSource c(Uri uri2, Context context, Cache cache) {
        Intrinsics.checkNotNullParameter(uri2, "uri");
        Intrinsics.checkNotNullParameter(context, "context");
        if (!Intrinsics.f(uri2.getScheme(), "http") && !Intrinsics.f(uri2.getScheme(), "https")) {
            ProgressiveMediaSource progressiveMediaSourceCreateMediaSource = new ProgressiveMediaSource.Factory(new DefaultDataSource.Factory(context)).createMediaSource(MediaItem.fromUri(uri2));
            Intrinsics.h(progressiveMediaSourceCreateMediaSource);
            return progressiveMediaSourceCreateMediaSource;
        }
        if (f(uri2)) {
            return b(uri2, cache);
        }
        String lastPathSegment = uri2.getLastPathSegment();
        if (lastPathSegment != null) {
            return d0.J(lastPathSegment, "m3u8", false) ? d(uri2, cache) : b(uri2, cache);
        }
        throw new IllegalStateException("Video URL is empty");
    }

    public static HlsMediaSource d(Uri uri2, Cache cache) {
        DefaultHttpDataSource.Factory userAgent = new DefaultHttpDataSource.Factory().setUserAgent((String) jo0.m.i.invoke());
        Intrinsics.checkNotNullExpressionValue(userAgent, "setUserAgent(...)");
        HlsMediaSource hlsMediaSourceCreateMediaSource = new HlsMediaSource.Factory(a(userAgent, cache)).createMediaSource(MediaItem.fromUri(uri2));
        Intrinsics.checkNotNullExpressionValue(hlsMediaSourceCreateMediaSource, "createMediaSource(...)");
        return hlsMediaSourceCreateMediaSource;
    }

    public static BaseMediaSource e(Uri uri2, SimpleCache simpleCache) {
        if (f(uri2)) {
            return b(uri2, simpleCache);
        }
        String lastPathSegment = uri2.getLastPathSegment();
        if (lastPathSegment == null) {
            throw new IllegalStateException("Video URL is empty");
        }
        if (d0.J(lastPathSegment, "m3u8", false)) {
            return d(uri2, simpleCache);
        }
        DefaultHttpDataSource.Factory userAgent = new DefaultHttpDataSource.Factory().setUserAgent((String) jo0.m.i.invoke());
        Intrinsics.checkNotNullExpressionValue(userAgent, "setUserAgent(...)");
        CacheDataSource.Factory factoryA = a(userAgent, simpleCache);
        DashMediaSource dashMediaSourceCreateMediaSource = new DashMediaSource.Factory(new DefaultDashChunkSource.Factory(factoryA), factoryA).createMediaSource(MediaItem.fromUri(uri2));
        Intrinsics.checkNotNullExpressionValue(dashMediaSourceCreateMediaSource, "createMediaSource(...)");
        return dashMediaSourceCreateMediaSource;
    }

    public static boolean f(Uri uri2) {
        String lastPathSegment = uri2.getLastPathSegment();
        if (lastPathSegment != null) {
            return d0.J(lastPathSegment, "mp3", false) || d0.J(lastPathSegment, "mp4", false);
        }
        throw new IllegalStateException("Video URL is empty");
    }
}

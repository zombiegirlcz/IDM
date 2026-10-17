package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import com.fourthline.core.VideoRecording;
import com.fourthline.core.location.Coordinate;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class b01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Bitmap f26955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Long f26956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Coordinate f26957c;
    private VideoRecording d;
    private Map e;
    private final UUID f;

    public b01(Bitmap bitmap, Long l2, Coordinate coordinate, VideoRecording videoRecording, Map extraData, UUID videoUUID) {
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        Intrinsics.checkNotNullParameter(videoUUID, "videoUUID");
        this.f26955a = bitmap;
        this.f26956b = l2;
        this.f26957c = coordinate;
        this.d = videoRecording;
        this.e = extraData;
        this.f = videoUUID;
    }

    private final boolean c() {
        return this.f26955a != null;
    }

    public final void a(Bitmap bitmap) {
        this.f26955a = bitmap;
    }

    public final Bitmap b() {
        return this.f26955a;
    }

    public final Coordinate d() {
        return this.f26957c;
    }

    public final Long e() {
        return this.f26956b;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b01)) {
            return false;
        }
        b01 b01Var = (b01) obj2;
        return Intrinsics.f(this.f26955a, b01Var.f26955a) && Intrinsics.f(this.f26956b, b01Var.f26956b) && Intrinsics.f(this.f26957c, b01Var.f26957c) && Intrinsics.f(this.d, b01Var.d) && Intrinsics.f(this.e, b01Var.e) && Intrinsics.f(this.f, b01Var.f);
    }

    public final boolean f() {
        return c() && l8.a(this.f26956b) && l8.a(this.f26957c);
    }

    public final VideoRecording g() {
        return this.d;
    }

    public int hashCode() {
        Bitmap bitmap = this.f26955a;
        int iHashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
        Long l2 = this.f26956b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Coordinate coordinate = this.f26957c;
        int iHashCode3 = (iHashCode2 + (coordinate == null ? 0 : coordinate.hashCode())) * 31;
        VideoRecording videoRecording = this.d;
        return ((((iHashCode3 + (videoRecording != null ? videoRecording.hashCode() : 0)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public String toString() {
        return "SelfieAttachmentBundle(image=" + this.f26955a + ", timestamp=" + this.f26956b + ", location=" + this.f26957c + ", videoRecording=" + this.d + ", extraData=" + this.e + ", videoUUID=" + this.f + ")";
    }

    public final void a(Long l2) {
        this.f26956b = l2;
    }

    public final void a(Coordinate coordinate) {
        this.f26957c = coordinate;
    }

    public final void a(VideoRecording videoRecording) {
        this.d = videoRecording;
    }

    public final Map a() {
        return this.e;
    }

    public final void a(Map map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.e = map;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ b01(Bitmap bitmap, Long l2, Coordinate coordinate, VideoRecording videoRecording, Map map, UUID uuid, int i, DefaultConstructorMarker defaultConstructorMarker) {
        bitmap = (i & 1) != 0 ? null : bitmap;
        l2 = (i & 2) != 0 ? null : l2;
        coordinate = (i & 4) != 0 ? null : coordinate;
        videoRecording = (i & 8) != 0 ? null : videoRecording;
        map = (i & 16) != 0 ? zhm.r0.g() : map;
        if ((i & 32) != 0) {
            uuid = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID(...)");
        }
        this(bitmap, l2, coordinate, videoRecording, map, uuid);
    }
}

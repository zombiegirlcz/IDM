package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import e8.r;
import e8.s;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f extends ContextWrapper {
    public static final a k = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f8.f f26088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f26089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ch.b f26090c;
    public final af.f d;
    public final List e;
    public final Map f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s f26091g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f26092h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public u8.h f26093j;

    public f(Context context, f8.f fVar, ch.m mVar, ch.b bVar, af.f fVar2, Map map, List list, s sVar, g gVar, int i) {
        super(context.getApplicationContext());
        this.f26088a = fVar;
        this.f26090c = bVar;
        this.d = fVar2;
        this.e = list;
        this.f = map;
        this.f26091g = sVar;
        this.f26092h = gVar;
        this.i = i;
        this.f26089b = new r(mVar);
    }

    public final Registry a() {
        return (Registry) this.f26089b.get();
    }
}

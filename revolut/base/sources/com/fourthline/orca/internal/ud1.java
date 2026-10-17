package com.fourthline.orca.internal;

import android.net.Uri;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ud1 implements rd1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rd1 f34055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f34056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f34057c;

    public ud1(rd1 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f34055a = delegate;
        wf0[] elements = {wf0.f34672g, wf0.i};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f34056b = kotlin.collections.d.y0(elements);
        wf0[] elements2 = {wf0.f34673h, wf0.f34674j};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        this.f34057c = kotlin.collections.d.y0(elements2);
    }

    @Override // com.fourthline.orca.internal.rd1
    public Uri a(wf0 key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Uri uriA = this.f34055a.a(key);
        return (this.f34056b.contains(key) && uc1.a(uriA)) ? this.f34055a.a(wf0.e) : (this.f34057c.contains(key) && uc1.a(uriA)) ? this.f34055a.a(wf0.f) : uriA;
    }
}

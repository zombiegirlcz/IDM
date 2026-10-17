package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c21;
import com.fourthline.orca.internal.m21;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class np1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c21.b.c f31466b;

    public /* synthetic */ np1(c21.b.c cVar, int i) {
        this.f31465a = i;
        this.f31466b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f31465a) {
            case 0:
                return m21.k.a(this.f31466b, (c21) obj2);
            default:
                return m21.a(this.f31466b, (c21) obj2);
        }
    }
}

package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class lt1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xe f30751b;

    public /* synthetic */ lt1(xe xeVar, int i) {
        this.f30750a = i;
        this.f30751b = xeVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f30750a) {
            case 0:
                return xe.b(this.f30751b, (li) obj2);
            case 1:
                return xe.c(this.f30751b, (li) obj2);
            default:
                return xe.a(this.f30751b, (li) obj2);
        }
    }
}

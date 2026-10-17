package com.fourthline.orca.internal;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class ti1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f33783b;

    public /* synthetic */ ti1(List list, int i) {
        this.f33782a = i;
        this.f33783b = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f33782a) {
            case 0:
                return Integer.valueOf(a40.a(this.f33783b));
            case 1:
                return eg.a(this.f33783b);
            case 2:
                return v41.a(this.f33783b);
            default:
                return Integer.valueOf(wp0.a(this.f33783b));
        }
    }
}

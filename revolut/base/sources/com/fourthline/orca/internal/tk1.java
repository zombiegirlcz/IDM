package com.fourthline.orca.internal;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class tk1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33792a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f33793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f33794c;

    public /* synthetic */ tk1(String str, boolean z) {
        this.f33794c = str;
        this.f33793b = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f33792a) {
            case 0:
                return d91.a(this.f33794c, this.f33793b, (v81) obj2);
            default:
                return fz.a(this.f33793b, this.f33794c, (SemanticsPropertyReceiver) obj2);
        }
    }

    public /* synthetic */ tk1(boolean z, String str) {
        this.f33793b = z;
        this.f33794c = str;
    }
}

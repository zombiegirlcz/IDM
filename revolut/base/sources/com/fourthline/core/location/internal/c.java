package com.fourthline.core.location.internal;

import com.google.android.gms.tasks.OnSuccessListener;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class c implements OnSuccessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f26446b;

    public /* synthetic */ c(int i, Function1 function1) {
        this.f26445a = i;
        this.f26446b = function1;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener, efm.f0
    public final void onSuccess(Object obj2) {
        switch (this.f26445a) {
            case 0:
                LocationFetcherImpl.b(this.f26446b, obj2);
                break;
            case 1:
                LocationFetcherImpl.c(this.f26446b, obj2);
                break;
            default:
                LocationFetcherImpl.a(this.f26446b, obj2);
                break;
        }
    }
}

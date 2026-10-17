package br;

import com.revolut.biometric_verification.impl.data.managers.DefferedUploadWorker;
import gim.c;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes17.dex */
public final class a extends c {
    public /* synthetic */ Object u;
    public final /* synthetic */ DefferedUploadWorker v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f17856w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(DefferedUploadWorker defferedUploadWorker, Continuation continuation) {
        super(continuation);
        this.v = defferedUploadWorker;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f17856w |= Integer.MIN_VALUE;
        return this.v.doWork(this);
    }
}

package aw;

import androidx.camera.core.CameraSelector;
import androidx.camera.core.UseCaseGroup;

/* JADX INFO: loaded from: classes16.dex */
public final class c extends gim.c {
    public CameraSelector u;
    public UseCaseGroup v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f10140w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k f10141x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f10142y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(k kVar, gim.c cVar) {
        super(cVar);
        this.f10141x = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f10140w = obj2;
        this.f10142y |= Integer.MIN_VALUE;
        return this.f10141x.m(null, null, this);
    }
}

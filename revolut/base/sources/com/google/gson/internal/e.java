package com.google.gson.internal;

import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import kg.l0;

/* JADX INFO: loaded from: classes17.dex */
public final class e extends l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile l0 f49630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f49631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f49632c;
    public final /* synthetic */ kg.o d;
    public final /* synthetic */ TypeToken e;
    public final /* synthetic */ f f;

    public e(f fVar, boolean z, boolean z3, kg.o oVar, TypeToken typeToken) {
        this.f = fVar;
        this.f49631b = z;
        this.f49632c = z3;
        this.d = oVar;
        this.e = typeToken;
    }

    @Override // kg.l0
    public final Object c(qg.a aVar) {
        if (this.f49631b) {
            aVar.H();
            return null;
        }
        l0 l0VarI = this.f49630a;
        if (l0VarI == null) {
            l0VarI = this.d.i(this.f, this.e);
            this.f49630a = l0VarI;
        }
        return l0VarI.c(aVar);
    }

    @Override // kg.l0
    public final void d(qg.c cVar, Object obj2) throws IOException {
        if (this.f49632c) {
            cVar.m();
            return;
        }
        l0 l0VarI = this.f49630a;
        if (l0VarI == null) {
            l0VarI = this.d.i(this.f, this.e);
            this.f49630a = l0VarI;
        }
        l0VarI.d(cVar, obj2);
    }
}

package com.fourthline.orca.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes23.dex */
public final class pt0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lt0 f32041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f32042b;

    private pt0(lt0 lt0Var, e4m.e eVar) {
        this.f32041a = lt0Var;
        this.f32042b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public lx get() {
        return a(this.f32041a, (Context) this.f32042b.get());
    }

    public static pt0 a(lt0 lt0Var, e4m.e eVar) {
        return new pt0(lt0Var, eVar);
    }

    public static lx a(lt0 lt0Var, Context context) {
        lx lxVarA = lt0Var.a(context);
        vc.s.k(lxVarA);
        return lxVarA;
    }
}

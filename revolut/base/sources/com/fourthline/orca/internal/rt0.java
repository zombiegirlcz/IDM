package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class rt0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lt0 f32828a;

    private rt0(lt0 lt0Var) {
        this.f32828a = lt0Var;
    }

    public static c70 b(lt0 lt0Var) {
        c70 c70VarA = lt0Var.a();
        vc.s.k(c70VarA);
        return c70VarA;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c70 get() {
        return b(this.f32828a);
    }

    public static rt0 a(lt0 lt0Var) {
        return new rt0(lt0Var);
    }
}

package com.fourthline.orca.internal;

import android.content.ContentResolver;
import androidx.view.result.ActivityResultRegistry;

/* JADX INFO: loaded from: classes23.dex */
public final class ot0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lt0 f31763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f31765c;

    private ot0(lt0 lt0Var, e4m.e eVar, e4m.e eVar2) {
        this.f31763a = lt0Var;
        this.f31764b = eVar;
        this.f31765c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public kx get() {
        return a(this.f31763a, (ContentResolver) this.f31764b.get(), (ActivityResultRegistry) this.f31765c.get());
    }

    public static ot0 a(lt0 lt0Var, e4m.e eVar, e4m.e eVar2) {
        return new ot0(lt0Var, eVar, eVar2);
    }

    public static kx a(lt0 lt0Var, ContentResolver contentResolver, ActivityResultRegistry activityResultRegistry) {
        kx kxVarA = lt0Var.a(contentResolver, activityResultRegistry);
        vc.s.k(kxVarA);
        return kxVarA;
    }
}

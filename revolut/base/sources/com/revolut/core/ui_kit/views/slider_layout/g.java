package com.revolut.core.ui_kit.views.slider_layout;

import dy0.m;
import dy0.r;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes20.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f59687a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f59688b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m f59689c = m.NONE;
    public f d;

    public g() {
        f.Companion.getClass();
        this.d = f.d;
    }

    public final f a(String str, boolean z) {
        d dVar = (d) this.f59687a.remove(str);
        if (z) {
            this.f59688b.remove(str);
        }
        if (Intrinsics.f(this.d.f59684a, dVar) && this.f59689c == m.NONE) {
            c();
        }
        return this.d;
    }

    public final f b(d dVar) {
        r rVar;
        String id10 = dVar.getId();
        LinkedHashMap linkedHashMap = this.f59688b;
        e eVar = (e) linkedHashMap.get(id10);
        if (eVar == null || (rVar = eVar.f59682a) == null) {
            rVar = r.HIDDEN;
        }
        e eVar2 = (e) linkedHashMap.get(dVar.getId());
        return new f(dVar, rVar, eVar2 != null ? eVar2.f59683b : null);
    }

    public final void c() {
        f fVarB;
        LinkedHashMap linkedHashMap = this.f59687a;
        Set setKeySet = linkedHashMap.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
        String str = (String) d0.n0(setKeySet);
        d dVar = str != null ? (d) linkedHashMap.get(str) : null;
        if (dVar == null) {
            f.Companion.getClass();
            fVarB = f.d;
        } else {
            fVarB = b(dVar);
        }
        this.d = fVarB;
    }
}

package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.CodeEditorDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f53663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ip0.ab f53664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CodeEditorDelegate.a f53665c;
    public final Boolean d;
    public final boolean e;

    public a4(String str, ip0.ab abVar, CodeEditorDelegate.a aVar, Boolean bool, boolean z) {
        this.f53663a = str;
        this.f53664b = abVar;
        this.f53665c = aVar;
        this.d = bool;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a4)) {
            return false;
        }
        a4 a4Var = (a4) obj2;
        return Intrinsics.f(this.f53663a, a4Var.f53663a) && this.f53664b == a4Var.f53664b && Intrinsics.f(this.f53665c, a4Var.f53665c) && Intrinsics.f(this.d, a4Var.d) && this.e == a4Var.e;
    }

    public final int hashCode() {
        String str = this.f53663a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ip0.ab abVar = this.f53664b;
        int iHashCode2 = (iHashCode + (abVar == null ? 0 : abVar.hashCode())) * 31;
        CodeEditorDelegate.a aVar = this.f53665c;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Boolean bool = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode3 + (bool != null ? bool.hashCode() : 0)) * 961);
    }
}

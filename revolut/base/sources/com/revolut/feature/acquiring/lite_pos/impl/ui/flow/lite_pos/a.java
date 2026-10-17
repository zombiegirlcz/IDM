package com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements oki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f60733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f60734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xd1.f f60735c;
    public final xd1.g d;

    public a(List pagerItems, String str, xd1.f primaryButtonModel, xd1.g secondaryButtonModel) {
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(primaryButtonModel, "primaryButtonModel");
        Intrinsics.checkNotNullParameter(secondaryButtonModel, "secondaryButtonModel");
        this.f60733a = pagerItems;
        this.f60734b = str;
        this.f60735c = primaryButtonModel;
        this.d = secondaryButtonModel;
    }

    public static a a(a aVar, String str, xd1.f primaryButtonModel, xd1.g secondaryButtonModel, int i) {
        List pagerItems = aVar.f60733a;
        if ((i & 2) != 0) {
            str = aVar.f60734b;
        }
        if ((i & 4) != 0) {
            primaryButtonModel = aVar.f60735c;
        }
        if ((i & 8) != 0) {
            secondaryButtonModel = aVar.d;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(primaryButtonModel, "primaryButtonModel");
        Intrinsics.checkNotNullParameter(secondaryButtonModel, "secondaryButtonModel");
        return new a(pagerItems, str, primaryButtonModel, secondaryButtonModel);
    }

    @Override // oki.a
    public final List W() {
        return this.f60733a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f60733a, aVar.f60733a) && Intrinsics.f(this.f60734b, aVar.f60734b) && Intrinsics.f(this.f60735c, aVar.f60735c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f60733a.hashCode() * 31;
        String str = this.f60734b;
        return this.d.hashCode() + ((this.f60735c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    @Override // oki.a
    public final String z() {
        return this.f60734b;
    }
}

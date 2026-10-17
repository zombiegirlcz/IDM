package aq4;

import b4c.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextLocalisedClause f8256b;

    public /* synthetic */ j(int i, TextLocalisedClause textLocalisedClause) {
        this.f8255a = i;
        this.f8256b = textLocalisedClause;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Throwable th10 = (Throwable) obj2;
        Function1 getDefaultErrorItems = (Function1) obj3;
        switch (this.f8255a) {
            case 0:
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return k.a(this.f8256b, (List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null)), false, false);
            case 1:
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new o(this.f8256b, th10 == null ? f0.f322471a : (List) getDefaultErrorItems.invoke(new iii.d(8, null, true, true, "ERROR_PRODUCTS_LIST_ID")));
            case 2:
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "<unused var>");
                return this.f8256b;
            default:
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "defaultError");
                return new vne.g(this.f8256b, (List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null)));
        }
    }

    public /* synthetic */ j(k kVar, TextLocalisedClause textLocalisedClause) {
        this.f8255a = 0;
        this.f8256b = textLocalisedClause;
    }
}

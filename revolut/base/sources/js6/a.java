package js6;

import com.google.gson.reflect.TypeToken;
import com.revolut.data.utils.gson.GsonHolder;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static List a(String str) {
        if (str == null) {
            return null;
        }
        kg.o oVarA = GsonHolder.a();
        Type type = new TypeToken<List<? extends ks6.c>>() { // from class: com.revolut.feature.freelancer.impl.database.converters.AcquiringOrderConverters$customFieldsFromJson$stub_for_inlining$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (List) objD;
    }

    public static List b(String str) {
        if (str == null) {
            return null;
        }
        kg.o oVarA = GsonHolder.a();
        Type type = new TypeToken<List<? extends ks6.d>>() { // from class: com.revolut.feature.freelancer.impl.database.converters.AcquiringOrderConverters$customersFromJson$stub_for_inlining$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (List) objD;
    }

    public static ks6.e c(String str) {
        if (str == null) {
            return null;
        }
        kg.o oVarA = GsonHolder.a();
        Type type = new TypeToken<ks6.e>() { // from class: com.revolut.feature.freelancer.impl.database.converters.AcquiringOrderConverters$deviceFromJson$stub_for_inlining$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (ks6.e) objD;
    }

    public static ks6.f d(String str) {
        if (str == null) {
            return null;
        }
        kg.o oVarA = GsonHolder.a();
        Type type = new TypeToken<ks6.f>() { // from class: com.revolut.feature.freelancer.impl.database.converters.AcquiringOrderConverters$initiationPageFromJson$stub_for_inlining$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (ks6.f) objD;
    }

    public static ks6.g e(String str) {
        if (str == null) {
            return null;
        }
        kg.o oVarA = GsonHolder.a();
        Type type = new TypeToken<ks6.g>() { // from class: com.revolut.feature.freelancer.impl.database.converters.AcquiringOrderConverters$invoiceFromJson$stub_for_inlining$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (ks6.g) objD;
    }

    public static ks6.h f(String str) {
        if (str == null) {
            return null;
        }
        kg.o oVarA = GsonHolder.a();
        Type type = new TypeToken<ks6.h>() { // from class: com.revolut.feature.freelancer.impl.database.converters.AcquiringOrderConverters$locationFromJson$stub_for_inlining$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (ks6.h) objD;
    }

    public static ks6.i g(String str) {
        if (str == null) {
            return null;
        }
        kg.o oVarA = GsonHolder.a();
        Type type = new TypeToken<ks6.i>() { // from class: com.revolut.feature.freelancer.impl.database.converters.AcquiringOrderConverters$primaryPaymentFromJson$stub_for_inlining$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (ks6.i) objD;
    }

    public static ks6.j h(String str) {
        if (str == null) {
            return null;
        }
        kg.o oVarA = GsonHolder.a();
        Type type = new TypeToken<ks6.j>() { // from class: com.revolut.feature.freelancer.impl.database.converters.AcquiringOrderConverters$userFromJson$stub_for_inlining$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (ks6.j) objD;
    }
}

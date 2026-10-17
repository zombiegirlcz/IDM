package com.revolut.core.faq.data.db.typeconverters;

import af0.a;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import kg.o;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import yhm.j;

/* JADX INFO: loaded from: classes.dex */
public final class FaqListConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f51380a = j.b(new a(1));

    public final List a(String str) {
        if (str == null) {
            return null;
        }
        o oVar = (o) this.f51380a.getValue();
        Type type = new TypeToken<List<? extends String>>() { // from class: com.revolut.core.faq.data.db.typeconverters.FaqListConverter$mapJsonToListOfStrings$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVar.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (List) objD;
    }
}

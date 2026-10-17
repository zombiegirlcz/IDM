package o97;

import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes21.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f223131a = new t(new s(2, null), r0.g());

    public static final boolean a(s sVar, int i) {
        Integer num;
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        p pVar = sVar.f223128b;
        return pVar != null && pVar.f223125a && ((num = pVar.f223126b) == null || i <= num.intValue());
    }
}

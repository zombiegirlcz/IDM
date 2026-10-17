package fll;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class c extends q implements Function1 {
    public static final c f = new c();

    public c() {
        super(1, Character.class, "isDigit", "isDigit(C)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return Boolean.valueOf(Character.isDigit(((Character) obj2).charValue()));
    }
}

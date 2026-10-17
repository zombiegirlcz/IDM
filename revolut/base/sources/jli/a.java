package jli;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.text.CharsKt;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a extends q implements Function1 {
    public static final a f = new a();

    public a() {
        super(1, CharsKt.class, "digitToInt", "digitToInt(C)I", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return Integer.valueOf(kotlin.text.a.a(((Character) obj2).charValue()));
    }
}

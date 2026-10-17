package com.revolut.feature.apm.core.impl.crypto;

import java.security.KeyFactory;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class f extends q implements Function2 {
    public static final f f = new f();

    public f() {
        super(2, KeyFactory.class, "getInstance", "getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/KeyFactory;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return KeyFactory.getInstance((String) obj2, (String) obj3);
    }
}

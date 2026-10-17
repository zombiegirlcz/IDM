package com.revolut.feature.apm.core.impl.crypto;

import java.security.KeyPairGenerator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class e extends q implements Function2 {
    public static final e f = new e();

    public e() {
        super(2, KeyPairGenerator.class, "getInstance", "getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/KeyPairGenerator;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return KeyPairGenerator.getInstance((String) obj2, (String) obj3);
    }
}

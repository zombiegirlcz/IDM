package com.fourthline.orca.internal;

import com.fourthline.core.DocumentTypeKt;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class zg {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Map b(nd1 nd1Var) {
        aim.f builder = new aim.f();
        builder.put("issuing_country", nd1Var.d());
        builder.put("document_type", DocumentTypeKt.toFourthlineValue(nd1Var.c()));
        builder.put("tilted", nd1Var.a());
        if (nd1Var.b() != null) {
            builder.put("document_side", nd1Var.b());
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.b();
    }
}

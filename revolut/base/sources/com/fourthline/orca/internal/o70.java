package com.fourthline.orca.internal;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class o70 {
    public static final String a(k70 k70Var, File fourthlineDirectory) {
        Intrinsics.checkNotNullParameter(k70Var, "<this>");
        Intrinsics.checkNotNullParameter(fourthlineDirectory, "fourthlineDirectory");
        String str = fourthlineDirectory.getAbsolutePath() + "/animations/";
        new File(str).mkdirs();
        return str + k70Var.b();
    }
}

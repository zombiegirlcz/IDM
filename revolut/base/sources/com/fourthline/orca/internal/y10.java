package com.fourthline.orca.internal;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class y10 {
    public static final String a(r10 r10Var, File fourthlineDirectory) {
        Intrinsics.checkNotNullParameter(r10Var, "<this>");
        Intrinsics.checkNotNullParameter(fourthlineDirectory, "fourthlineDirectory");
        String str = fourthlineDirectory.getAbsolutePath() + "/images/";
        new File(str).mkdirs();
        return str + r10Var.b();
    }
}

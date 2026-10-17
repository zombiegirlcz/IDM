package com.fourthline.orca.internal;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class td1 {
    public static final String a(wf0 wf0Var, File fourthlineDirectory) {
        Intrinsics.checkNotNullParameter(wf0Var, "<this>");
        Intrinsics.checkNotNullParameter(fourthlineDirectory, "fourthlineDirectory");
        String str = fourthlineDirectory.getAbsolutePath() + "/videos/";
        new File(str).mkdirs();
        return str + wf0Var.b();
    }
}

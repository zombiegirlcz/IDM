package com.fourthline.orca.internal;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class y1 {
    public static final String a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str + "/bundle.zip";
    }

    public static final File a(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new File(file, "bundle.zip");
    }
}

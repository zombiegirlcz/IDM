package com.fourthline.orca.internal;

import kotlin.Pair;

/* JADX INFO: loaded from: classes23.dex */
public abstract class j2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair b(String str) {
        return new Pair("Authorization", "Bearer " + str);
    }
}

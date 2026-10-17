package com.fourthline.orca.internal;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes23.dex */
public abstract class qe {
    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleDateFormat b(SimpleDateFormat simpleDateFormat) {
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat;
    }
}

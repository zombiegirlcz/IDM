package com.google.android.gms.internal.fido;

import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
final class zzfd implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return ((String) ((Map.Entry) obj2).getKey()).compareTo((String) ((Map.Entry) obj3).getKey());
    }
}

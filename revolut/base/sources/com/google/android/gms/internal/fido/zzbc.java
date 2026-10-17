package com.google.android.gms.internal.fido;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class zzbc {
    public static final Appendable zza(Appendable appendable, Iterator it8, zzbd zzbdVar, String str) throws IOException {
        if (it8.hasNext()) {
            Map.Entry entry = (Map.Entry) it8.next();
            appendable.append(zzbd.zzd(entry.getKey()));
            appendable.append(" : ");
            appendable.append(zzbd.zzd(entry.getValue()));
            while (it8.hasNext()) {
                appendable.append(zzbdVar.f39301zza);
                Map.Entry entry2 = (Map.Entry) it8.next();
                appendable.append(zzbd.zzd(entry2.getKey()));
                appendable.append(" : ");
                appendable.append(zzbd.zzd(entry2.getValue()));
            }
        }
        return appendable;
    }
}

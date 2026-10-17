package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.zzef;
import com.google.android.gms.internal.play_billing.zzeg;
import j6.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzeg<MessageType extends zzeg<MessageType, BuilderType>, BuilderType extends zzef<MessageType, BuilderType>> implements zzhb {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    protected transient int f45954zza = 0;

    public static void zzk(Iterable iterable, List list) {
        byte[] bArr = zzga.f46030zzb;
        int size = ((Collection) iterable).size();
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + size);
        } else if (list instanceof zzhj) {
            ((zzhj) list).zzf(list.size() + size);
        }
        int size2 = list.size();
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i = 0; i < size3; i++) {
            Object obj2 = list2.get(i);
            if (obj2 == null) {
                String strL = a.l(list.size() - size2, "Element at index ", " is null.");
                int size4 = list.size();
                while (true) {
                    size4--;
                    if (size4 < size2) {
                        throw new NullPointerException(strL);
                    }
                    list.remove(size4);
                }
            } else {
                list.add(obj2);
            }
        }
    }

    public final byte[] zzQ() {
        try {
            int iZzn = zzn();
            byte[] bArr = new byte[iZzn];
            int i = zzfc.f45984zzb;
            zzez zzezVar = new zzez(bArr, 0, iZzn);
            zzD(zzezVar);
            zzezVar.zzA();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(p.a.p("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
        }
    }

    public int zzi(zzhl zzhlVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhb
    public final zzev zzj() {
        try {
            int iZzn = zzn();
            zzev zzevVar = zzev.f45974zza;
            byte[] bArr = new byte[iZzn];
            int i = zzfc.f45984zzb;
            zzez zzezVar = new zzez(bArr, 0, iZzn);
            zzD(zzezVar);
            return zzer.zza(zzezVar, bArr);
        } catch (IOException e) {
            throw new RuntimeException(p.a.p("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e);
        }
    }
}

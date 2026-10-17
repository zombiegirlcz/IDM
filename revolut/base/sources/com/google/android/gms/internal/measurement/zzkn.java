package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzkn;
import com.google.android.gms.internal.measurement.zzko;
import j6.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzkn<MessageType extends zzko<MessageType, BuilderType>, BuilderType extends zzkn<MessageType, BuilderType>> implements zzng {
    private static void zza(List list, int i) {
        String strL = a.l(list.size() - i, "Element at index ", " is null.");
        int size = list.size();
        while (true) {
            size--;
            if (size < i) {
                throw new NullPointerException(strL);
            }
            list.remove(size);
        }
    }

    public static void zzaW(Iterable iterable, List list) {
        byte[] bArr = zzmk.f40466zzb;
        iterable.getClass();
        if (iterable instanceof zzmt) {
            List listZza = ((zzmt) iterable).zza();
            zzmt zzmtVar = (zzmt) list;
            int size = list.size();
            for (Object obj2 : listZza) {
                if (obj2 == null) {
                    String strL = a.l(zzmtVar.size() - size, "Element at index ", " is null.");
                    int size2 = zzmtVar.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            throw new NullPointerException(strL);
                        }
                        zzmtVar.remove(size2);
                    }
                } else if (obj2 instanceof zzld) {
                    zzmtVar.zzb();
                } else if (obj2 instanceof byte[]) {
                    byte[] bArr2 = (byte[]) obj2;
                    zzld.zzj(bArr2, 0, bArr2.length);
                    zzmtVar.zzb();
                } else {
                    zzmtVar.add((String) obj2);
                }
            }
            return;
        }
        if (iterable instanceof zzno) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size3 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size3);
            } else if (list instanceof zznq) {
                ((zznq) list).zzf(list.size() + size3);
            }
        }
        int size4 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj3 : iterable) {
                if (obj3 == null) {
                    zza(list, size4);
                }
                list.add(obj3);
            }
            return;
        }
        List list2 = (List) iterable;
        int size5 = list2.size();
        for (int i = 0; i < size5; i++) {
            Object obj4 = list2.get(i);
            if (obj4 == null) {
                zza(list, size4);
            }
            list.add(obj4);
        }
    }

    @Override // 
    public abstract zzkn zzaR();

    public zzkn zzaS(byte[] bArr, int i, int i2) throws zzmm {
        throw null;
    }

    public zzkn zzaT(byte[] bArr, int i, int i2, zzlp zzlpVar) throws zzmm {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzng
    public final /* synthetic */ zzng zzaU(byte[] bArr) throws zzmm {
        return zzaS(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.measurement.zzng
    public final /* synthetic */ zzng zzaV(byte[] bArr, zzlp zzlpVar) throws zzmm {
        return zzaT(bArr, 0, bArr.length, zzlpVar);
    }
}

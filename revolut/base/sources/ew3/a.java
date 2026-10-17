package ew3;

import com.google.common.collect.ImmutableSet;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.text.d0;
import ye9.h;
import yqi.f;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements yqi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f130070a;

    public a(ImmutableSet validators) {
        Intrinsics.checkNotNullParameter(validators, "validators");
        this.f130070a = validators;
    }

    public ye9.c b(String value) {
        List list;
        Intrinsics.checkNotNullParameter(value, "value");
        int i = 0;
        f[] fVarArr = (f[]) this.f130070a.toArray(new f[0]);
        List list2 = super.a((f[]) Arrays.copyOf(fVarArr, fVarArr.length), d0.F0(value).toString()).f316033b;
        int size = list2.size();
        while (true) {
            if (i >= size) {
                list = list2;
                break;
            }
            if (!(list2.get(i) instanceof h)) {
                list = null;
                break;
            }
            i++;
        }
        if (list != null) {
            return list.isEmpty() ? ye9.b.f312822a : new ye9.a(list);
        }
        throw new IllegalStateException((list2 + " are not compatible. Expected all to be of " + o0.f186429a.b(h.class).m()).toString());
    }

    public a(Set set) {
        this.f130070a = set;
    }
}

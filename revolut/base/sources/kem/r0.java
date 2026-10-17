package kem;

import java.nio.charset.CharacterCodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class r0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f183235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f183236b;

    public r0(g0 encodedParametersBuilder) {
        Intrinsics.checkNotNullParameter(encodedParametersBuilder, "encodedParametersBuilder");
        this.f183235a = encodedParametersBuilder;
        this.f183236b = encodedParametersBuilder.a();
    }

    @Override // oem.n
    public final boolean a() {
        return this.f183236b;
    }

    @Override // oem.n
    public final List b(String name) throws CharacterCodingException {
        Intrinsics.checkNotNullParameter(name, "name");
        List listB = this.f183235a.b(b.e(name, false));
        if (listB == null) {
            return null;
        }
        List list = listB;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(b.d(0, 0, 11, (String) it8.next()));
        }
        return arrayList;
    }

    @Override // oem.n
    public final void c(Iterable values, String name) throws CharacterCodingException {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(values, "values");
        String strE = b.e(name, false);
        ArrayList arrayList = new ArrayList(zhm.w.t(values, 10));
        Iterator it8 = values.iterator();
        while (it8.hasNext()) {
            String str = (String) it8.next();
            Intrinsics.checkNotNullParameter(str, "<this>");
            arrayList.add(b.e(str, true));
        }
        this.f183235a.c(arrayList, strE);
    }

    @Override // oem.n
    public final void clear() {
        this.f183235a.clear();
    }

    @Override // oem.n
    public final boolean contains(String name) throws CharacterCodingException {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f183235a.contains(b.e(name, false));
    }

    @Override // oem.n
    public final void d(String name, String value) throws CharacterCodingException {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        String strE = b.e(name, false);
        Intrinsics.checkNotNullParameter(value, "<this>");
        this.f183235a.d(strE, b.e(value, true));
    }

    @Override // oem.n
    public final Set entries() {
        return ((oem.p) a1m.e.p(this.f183235a)).entries();
    }

    @Override // oem.n
    public final boolean isEmpty() {
        return this.f183235a.isEmpty();
    }

    @Override // oem.n
    public final Set names() {
        Set setNames = this.f183235a.names();
        ArrayList arrayList = new ArrayList(zhm.w.t(setNames, 10));
        Iterator it8 = setNames.iterator();
        while (it8.hasNext()) {
            arrayList.add(b.d(0, 0, 15, (String) it8.next()));
        }
        return zhm.d0.i1(arrayList);
    }
}

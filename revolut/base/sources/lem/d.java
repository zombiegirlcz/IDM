package lem;

import kotlin.jvm.internal.Intrinsics;
import nkm.p;

/* JADX INFO: loaded from: classes23.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mem.e f194599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f194600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f194601c;
    public c d;

    public d(mem.e builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f194599a = builder;
        this.d = (c) f.f194603b.n8();
    }

    public final CharSequence a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (this.f194600b == 0) {
            return null;
        }
        int i = mem.h.f204798a;
        int iAbs = Math.abs(mem.h.a(name, 0, name.length()));
        int i2 = this.f194601c;
        while (true) {
            int i3 = iAbs % i2;
            int i5 = i3 * 6;
            if (this.d.a(i5) == -1) {
                return null;
            }
            if (b(i5, name)) {
                return this.f194599a.subSequence(this.d.a(i5 + 3), this.d.a(i5 + 4));
            }
            iAbs = i3 + 1;
            i2 = this.f194601c;
        }
    }

    public final boolean b(int i, CharSequence other) {
        int iA = this.d.a(i + 1);
        int iA2 = this.d.a(i + 2);
        int i2 = mem.h.f204798a;
        mem.e eVar = this.f194599a;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (iA2 - iA != other.length()) {
            return false;
        }
        for (int i3 = iA; i3 < iA2; i3++) {
            int iCharAt = eVar.charAt(i3);
            if (65 <= iCharAt && iCharAt < 91) {
                iCharAt += 32;
            }
            int iCharAt2 = other.charAt(i3 - iA);
            if (65 <= iCharAt2 && iCharAt2 < 91) {
                iCharAt2 += 32;
            }
            if (iCharAt != iCharAt2) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [gim.h, kotlin.jvm.functions.Function2] */
    public final void c(int i, int i2, int i3, int i5) {
        int i6;
        int i21 = this.f194600b;
        double d = i21;
        int i22 = this.f194601c;
        if (d >= ((double) i22) * 0.75d) {
            c cVar = this.d;
            this.f194600b = 0;
            this.f194601c = (i22 * 2) | 128;
            c cVar2 = (c) f.f194603b.n8();
            int size = (cVar.f194598a.size() * 2) | 1;
            for (int i32 = 0; i32 < size; i32++) {
                cVar2.f194598a.add(f.f194602a.n8());
            }
            this.d = cVar2;
            nkm.n nVarA = p.a((gim.h) p.b(new b(cVar, null)).f195577b);
            while (nVarA.hasNext()) {
                int iIntValue = ((Number) nVarA.next()).intValue();
                c(cVar.a(iIntValue + 1), cVar.a(iIntValue + 2), cVar.a(iIntValue + 3), cVar.a(iIntValue + 4));
            }
            f.f194603b.d5(cVar);
            if (i21 != this.f194600b) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        mem.e eVar = this.f194599a;
        int iAbs = Math.abs(mem.h.a(eVar, i, i2));
        CharSequence charSequenceSubSequence = eVar.subSequence(i, i2);
        int i33 = iAbs % this.f194601c;
        int i43 = -1;
        while (true) {
            i6 = i33 * 6;
            if (this.d.a(i6) == -1) {
                break;
            }
            if (b(i6, charSequenceSubSequence)) {
                i43 = i33;
            }
            i33 = (i33 + 1) % this.f194601c;
        }
        this.d.b(i6, iAbs);
        this.d.b(i6 + 1, i);
        this.d.b(i6 + 2, i2);
        this.d.b(i6 + 3, i3);
        this.d.b(i6 + 4, i5);
        this.d.b(i6 + 5, -1);
        if (i43 != -1) {
            this.d.b((i43 * 6) + 5, i33);
        }
        this.f194600b++;
    }

    public final void d() {
        this.f194600b = 0;
        this.f194601c = 0;
        e eVar = f.f194603b;
        eVar.d5(this.d);
        this.d = (c) eVar.n8();
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [gim.h, kotlin.jvm.functions.Function2] */
    public final String toString() {
        StringBuilder out = new StringBuilder();
        e eVar = f.f194602a;
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter("", "indent");
        Intrinsics.checkNotNullParameter(out, "out");
        c cVar = this.d;
        cVar.getClass();
        nkm.n nVarA = p.a((gim.h) p.b(new b(cVar, null)).f195577b);
        while (nVarA.hasNext()) {
            int iIntValue = ((Number) nVarA.next()).intValue();
            out.append((CharSequence) "");
            int iA = this.d.a(iIntValue + 1);
            int iA2 = this.d.a(iIntValue + 2);
            mem.e eVar2 = this.f194599a;
            out.append(eVar2.subSequence(iA, iA2));
            out.append((CharSequence) " => ");
            out.append(eVar2.subSequence(this.d.a(iIntValue + 3), this.d.a(iIntValue + 4)));
            out.append((CharSequence) "\n");
        }
        return out.toString();
    }
}

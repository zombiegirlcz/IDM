package gk3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f144319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f144320b;

    public d(ArrayList arrayList, ArrayList fields) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        this.f144319a = arrayList;
        this.f144320b = fields;
    }

    public final a a() {
        Object next;
        Iterator it8 = this.f144320b.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((a) next).f144316a == c.CITY) {
                break;
            }
        }
        return (a) next;
    }

    public final a b() {
        Object next;
        Iterator it8 = this.f144320b.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((a) next).f144316a == c.FLAT) {
                break;
            }
        }
        return (a) next;
    }

    public final a c() {
        Object next;
        Iterator it8 = this.f144320b.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((a) next).f144316a == c.HOUSE_NUMBER) {
                break;
            }
        }
        return (a) next;
    }

    public final a d() {
        Object next;
        Iterator it8 = this.f144320b.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((a) next).f144316a == c.LANDMARK) {
                break;
            }
        }
        return (a) next;
    }

    public final a e() {
        Object next;
        Iterator it8 = this.f144320b.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((a) next).f144316a == c.NEIGHBOURHOOD) {
                break;
            }
        }
        return (a) next;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f144319a, dVar.f144319a) && this.f144320b.equals(dVar.f144320b);
    }

    public final a f() {
        Object next;
        Iterator it8 = this.f144320b.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((a) next).f144316a == c.POSTCODE) {
                break;
            }
        }
        return (a) next;
    }

    public final a g() {
        Object next;
        Iterator it8 = this.f144320b.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((a) next).f144316a == c.REGION) {
                break;
            }
        }
        return (a) next;
    }

    public final a h() {
        Object next;
        Iterator it8 = this.f144320b.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((a) next).f144316a == c.STR) {
                break;
            }
        }
        return (a) next;
    }

    public final int hashCode() {
        List list = this.f144319a;
        return this.f144320b.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final a i() {
        Object next;
        Iterator it8 = this.f144320b.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((a) next).f144316a == c.STR1) {
                break;
            }
        }
        return (a) next;
    }

    public final a j() {
        Object next;
        Iterator it8 = this.f144320b.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((a) next).f144316a == c.STR2) {
                break;
            }
        }
        return (a) next;
    }

    public final a k() {
        Object next;
        Iterator it8 = this.f144320b.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((a) next).f144316a == c.STR_TYPE) {
                break;
            }
        }
        return (a) next;
    }
}

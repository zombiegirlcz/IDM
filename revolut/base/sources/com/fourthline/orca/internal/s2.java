package com.fourthline.orca.internal;

import com.fourthline.orca.internal.m80;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class s2 implements ie1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m80.b f32879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m80.a f32880c;
    private final c81 d;
    private final r2 e;

    public s2(String name, m80.b primaryButtonState, m80.a secondaryButtonState, c81 title, r2 itemPicker) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primaryButtonState, "primaryButtonState");
        Intrinsics.checkNotNullParameter(secondaryButtonState, "secondaryButtonState");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(itemPicker, "itemPicker");
        this.f32878a = name;
        this.f32879b = primaryButtonState;
        this.f32880c = secondaryButtonState;
        this.d = title;
        this.e = itemPicker;
    }

    public final s2 a(String name, m80.b primaryButtonState, m80.a secondaryButtonState, c81 title, r2 itemPicker) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primaryButtonState, "primaryButtonState");
        Intrinsics.checkNotNullParameter(secondaryButtonState, "secondaryButtonState");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(itemPicker, "itemPicker");
        return new s2(name, primaryButtonState, secondaryButtonState, title, itemPicker);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s2)) {
            return false;
        }
        s2 s2Var = (s2) obj2;
        return Intrinsics.f(this.f32878a, s2Var.f32878a) && Intrinsics.f(this.f32879b, s2Var.f32879b) && Intrinsics.f(this.f32880c, s2Var.f32880c) && Intrinsics.f(this.d, s2Var.d) && Intrinsics.f(this.e, s2Var.e);
    }

    public final c81 getTitle() {
        return this.d;
    }

    public int hashCode() {
        return (((((((this.f32878a.hashCode() * 31) + this.f32879b.hashCode()) * 31) + this.f32880c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final r2 n() {
        return this.e;
    }

    public final String o() {
        return this.f32878a;
    }

    public final m80.b p() {
        return this.f32879b;
    }

    public final m80.a q() {
        return this.f32880c;
    }

    public String toString() {
        return "State(name=" + this.f32878a + ", primaryButtonState=" + this.f32879b + ", secondaryButtonState=" + this.f32880c + ", title=" + this.d + ", itemPicker=" + this.e + ")";
    }

    public static /* synthetic */ s2 a(s2 s2Var, String str, m80.b bVar, m80.a aVar, c81 c81Var, r2 r2Var, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = s2Var.f32878a;
        }
        if ((i & 2) != 0) {
            bVar = s2Var.f32879b;
        }
        if ((i & 4) != 0) {
            aVar = s2Var.f32880c;
        }
        if ((i & 8) != 0) {
            c81Var = s2Var.d;
        }
        if ((i & 16) != 0) {
            r2Var = s2Var.e;
        }
        r2 r2Var2 = r2Var;
        m80.a aVar2 = aVar;
        return s2Var.a(str, bVar, aVar2, c81Var, r2Var2);
    }
}

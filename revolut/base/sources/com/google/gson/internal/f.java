package com.google.gson.internal;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kg.l0;
import kg.m0;

/* JADX INFO: loaded from: classes.dex */
public final class f implements m0, Cloneable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f49633c = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f49634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f49635b;

    public f() {
        List list = Collections.EMPTY_LIST;
        this.f49634a = list;
        this.f49635b = list;
    }

    @Override // kg.m0
    public final l0 a(kg.o oVar, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        boolean zC = c(rawType, true);
        boolean zC2 = c(rawType, false);
        if (zC || zC2) {
            return new e(this, zC2, zC, oVar, typeToken);
        }
        return null;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final f clone() {
        try {
            return (f) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean c(Class cls, boolean z) {
        if (!z && !Enum.class.isAssignableFrom(cls)) {
            te0.w wVar = og.c.f224953a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it8 = (z ? this.f49634a : this.f49635b).iterator();
        while (it8.hasNext()) {
            ((kg.a) it8.next()).getClass();
        }
        return false;
    }
}

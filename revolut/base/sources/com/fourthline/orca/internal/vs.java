package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.core.eid.EidServiceProvider;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.m;

/* JADX INFO: loaded from: classes23.dex */
public abstract class vs {
    public static final boolean a(Context context) {
        Object objA;
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            try {
                m.Companion companion = yhm.m.INSTANCE;
                Constructor<?> constructor = Class.forName("com.fourthline.eid.RealEidServiceProvider").getConstructor(Context.class, CoroutineScope.class);
                skm.p0 p0Var = skm.p0.f264001a;
                Object objNewInstance = constructor.newInstance(context, skm.e0.c(zkm.o.f323119a.e));
                Intrinsics.i(objNewInstance, "null cannot be cast to non-null type com.fourthline.core.eid.EidServiceProvider");
                objA = Boolean.valueOf(((EidServiceProvider) objNewInstance).isAvailable());
            } catch (Throwable th10) {
                m.Companion companion2 = yhm.m.INSTANCE;
                objA = yhm.o.a(th10);
            }
            Object obj2 = Boolean.FALSE;
            if (objA instanceof yhm.n) {
                objA = obj2;
            }
            return ((Boolean) objA).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }
}

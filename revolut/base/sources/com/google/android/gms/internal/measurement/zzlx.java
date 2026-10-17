package com.google.android.gms.internal.measurement;

import j6.a;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzlx {
    public static zzlp zzb(Class cls) {
        String strR;
        ClassLoader classLoader = zzlx.class.getClassLoader();
        if (cls.equals(zzlp.class)) {
            strR = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!cls.getPackage().equals(zzlx.class.getPackage())) {
                throw new IllegalArgumentException(cls.getName());
            }
            strR = a.r(cls.getPackage().getName(), ".BlazeGenerated", cls.getSimpleName(), "Loader");
        }
        try {
            try {
                try {
                    try {
                        return (zzlp) cls.cast(((zzlx) Class.forName(strR, true, classLoader).getConstructor(null).newInstance(null)).zza());
                    } catch (InvocationTargetException e) {
                        throw new IllegalStateException(e);
                    }
                } catch (NoSuchMethodException e2) {
                    throw new IllegalStateException(e2);
                }
            } catch (IllegalAccessException e4) {
                throw new IllegalStateException(e4);
            } catch (InstantiationException e5) {
                throw new IllegalStateException(e5);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it8 = ServiceLoader.load(zzlx.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it8.hasNext()) {
                try {
                    arrayList.add((zzlp) cls.cast(((zzlx) it8.next()).zza()));
                } catch (ServiceConfigurationError e6) {
                    Logger.getLogger(zzlk.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(cls.getSimpleName()), (Throwable) e6);
                }
            }
            if (arrayList.size() == 1) {
                return (zzlp) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (zzlp) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e22) {
                throw new IllegalStateException(e22);
            } catch (NoSuchMethodException e33) {
                throw new IllegalStateException(e33);
            } catch (InvocationTargetException e35) {
                throw new IllegalStateException(e35);
            }
        }
    }

    public abstract zzlp zza();
}

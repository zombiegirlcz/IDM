package mg;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f205052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f205053c;

    public b0(String str, Field field) {
        this.f205051a = str;
        this.f205052b = field;
        this.f205053c = field.getName();
    }

    public abstract void a(qg.a aVar, Object obj2);

    public abstract void b(qg.c cVar, Object obj2);
}

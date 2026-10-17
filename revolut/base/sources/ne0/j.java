package ne0;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface j extends od0.e {

    @NotNull
    public static final i Companion = i.f214389a;

    boolean contains(Object obj2);

    void f(Object obj2, Object obj3);

    Object get(Object obj2);

    List getAll();

    Object remove(Object obj2);

    void t1(Collection collection, Function1 function1);
}

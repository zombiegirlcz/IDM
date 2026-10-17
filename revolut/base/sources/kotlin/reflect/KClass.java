package kotlin.reflect;

import java.util.List;
import wim.c;

/* JADX INFO: loaded from: classes13.dex */
public interface KClass extends KDeclarationContainer, wim.b, c {
    String e();

    List getSupertypes();

    List getTypeParameters();

    int hashCode();

    List i();

    boolean isAbstract();

    boolean isInner();

    boolean isSealed();

    boolean isValue();

    Object k();

    boolean l(Object obj2);

    String m();
}

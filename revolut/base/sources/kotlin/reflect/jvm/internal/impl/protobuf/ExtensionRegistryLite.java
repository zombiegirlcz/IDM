package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes13.dex */
public class ExtensionRegistryLite {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ExtensionRegistryLite f187500b = new ExtensionRegistryLite(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f187501a;

    public ExtensionRegistryLite() {
        this.f187501a = new HashMap();
    }

    public static ExtensionRegistryLite getEmptyRegistry() {
        return f187500b;
    }

    public static ExtensionRegistryLite newInstance() {
        return new ExtensionRegistryLite();
    }

    public final void add(GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension) {
        this.f187501a.put(new vjm.a(generatedExtension.getContainingTypeDefaultInstance(), generatedExtension.getNumber()), generatedExtension);
    }

    public <ContainingType extends MessageLite> GeneratedMessageLite.GeneratedExtension<ContainingType, ?> findLiteExtensionByNumber(ContainingType containingtype, int i) {
        return (GeneratedMessageLite.GeneratedExtension) this.f187501a.get(new vjm.a(containingtype, i));
    }

    public ExtensionRegistryLite(int i) {
        this.f187501a = Collections.EMPTY_MAP;
    }
}

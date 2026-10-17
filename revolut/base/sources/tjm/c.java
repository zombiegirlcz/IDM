package tjm;

/* JADX INFO: loaded from: classes13.dex */
public final class c extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.header.a f271817b;

    public c(kotlin.reflect.jvm.internal.impl.load.kotlin.header.a aVar) {
        this.f271817b = aVar;
    }

    @Override // tjm.a
    public final void b(String[] strArr) {
        if (strArr == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2.visitEnd must not be null");
        }
        this.f271817b.f187116a.f = strArr;
    }
}

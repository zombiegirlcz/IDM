package tjm;

/* JADX INFO: loaded from: classes13.dex */
public final class b extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.header.a f271816b;

    public b(kotlin.reflect.jvm.internal.impl.load.kotlin.header.a aVar) {
        this.f271816b = aVar;
    }

    @Override // tjm.a
    public final void b(String[] strArr) {
        if (strArr == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1.visitEnd must not be null");
        }
        this.f271816b.f187116a.e = strArr;
    }
}

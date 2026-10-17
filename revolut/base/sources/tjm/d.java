package tjm;

/* JADX INFO: loaded from: classes14.dex */
public final class d extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f271818b;

    public d(e eVar) {
        this.f271818b = eVar;
    }

    @Override // tjm.a
    public final void b(String[] strArr) {
        if (strArr == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1.visitEnd must not be null");
        }
        this.f271818b.f271819a.i = strArr;
    }
}

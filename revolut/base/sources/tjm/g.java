package tjm;

/* JADX INFO: loaded from: classes14.dex */
public final class g extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f271821b;

    public g(h hVar) {
        this.f271821b = hVar;
    }

    @Override // tjm.a
    public final void b(String[] strArr) {
        if (strArr == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2.visitEnd must not be null");
        }
        this.f271821b.f271822a.f = strArr;
    }
}

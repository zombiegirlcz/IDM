package org.bouncycastle.oer;

import org.bouncycastle.oer.OERDefinition;

/* JADX INFO: loaded from: classes14.dex */
public class DeferredElementSupplier implements ElementSupplier {
    private Element buildProduct;

    /* JADX INFO: renamed from: src, reason: collision with root package name */
    private final OERDefinition.Builder f228738src;

    public DeferredElementSupplier(OERDefinition.Builder builder) {
        this.f228738src = builder;
    }

    @Override // org.bouncycastle.oer.ElementSupplier
    public Element build() {
        Element element;
        synchronized (this) {
            try {
                if (this.buildProduct == null) {
                    this.buildProduct = this.f228738src.build();
                }
                element = this.buildProduct;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return element;
    }
}

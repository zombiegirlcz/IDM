package yki;

import com.revolut.kompot.R$layout;

/* JADX INFO: loaded from: classes13.dex */
public interface f extends oki.f, qji.c {
    @Override // qji.c
    default boolean b() {
        return k().b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    default int getLayoutId() {
        Integer num = ((com.revolut.kompot.navigable.a) this).q2().f206460a.y2().f98419b;
        return num != null ? num.intValue() : R$layout.base_flow_container;
    }

    @Override // oki.f
    c k();
}

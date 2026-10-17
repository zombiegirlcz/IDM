package kotlinx.coroutines.flow;

/* JADX INFO: loaded from: classes13.dex */
public interface MutableStateFlow extends StateFlow, MutableSharedFlow {
    @Override // kotlinx.coroutines.flow.StateFlow
    Object getValue();

    boolean h(Object obj2, Object obj3);

    void setValue(Object obj2);
}

package j23;

import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes21.dex */
public interface p {
    Flow a();

    default Flow b() {
        return new go.g(null, 2);
    }
}

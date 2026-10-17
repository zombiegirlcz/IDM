package u9;

import com.fasterxml.jackson.databind.JsonMappingException;
import v9.o0;

/* JADX INFO: loaded from: classes16.dex */
public final class c extends o0 {
    @Override // k9.k
    public final void f(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar) throws JsonMappingException {
        vVar.getClass();
        throw new JsonMappingException(((t9.i) vVar).o, "Null key for a Map not allowed in JSON (use a converting NullKeySerializer?)", null);
    }
}

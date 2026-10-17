package org.ejbca.cvc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.ejbca.cvc.exception.ConstructionException;

/* JADX INFO: loaded from: classes14.dex */
public class CVCertificateExtensions extends AbstractArray {
    private static final long serialVersionUID = 1;

    public CVCertificateExtensions() {
        super(CVCTagEnum.CERTIFICATE_EXTENSIONS);
    }

    @Override // org.ejbca.cvc.AbstractArray
    public CVCTagEnum getAllowedField() {
        return CVCTagEnum.DISCRETIONARY_DATA_TEMPLATE;
    }

    public List<CVCDiscretionaryDataTemplate> getExtensions() {
        ArrayList arrayList = new ArrayList();
        Iterator<CVCObject> it8 = getEncodableFields().iterator();
        while (it8.hasNext()) {
            arrayList.add((CVCDiscretionaryDataTemplate) it8.next());
        }
        return arrayList;
    }

    public CVCertificateExtensions(Collection<CVCDiscretionaryDataTemplate> collection) throws ConstructionException {
        this();
        Iterator<CVCDiscretionaryDataTemplate> it8 = collection.iterator();
        while (it8.hasNext()) {
            addSubfield(it8.next());
        }
    }
}
